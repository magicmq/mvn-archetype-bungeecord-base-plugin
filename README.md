# BasePluginArchetype

> A Maven archetype for creating Bukkit plugins.

I had another archetype that was made for use with [CNL](https://github.com/Rayzr522/CreativelyNamedLib), but I haven't touched CNL in a while and I got sick of cutting the CNL code out of every new project I made. I'll mess with CreativelyNamedLib again at *some point*, but for now, this is better.

Admittedly this is a modified version of another archetype I created, which you can find here: [PerceivePluginArchetype](https://github.com/PerceiveDev/PerceivePluginArchetype).

## Installation

Download this repository, navigate to it in your command prompt / terminal and run:

    mvn

## Usage

To create a project, use the following command (filling in the fields as necessary):

    mvn archetype:generate \
      -DarchetypeGroupId=me.rayzr522 \
      -DarchetypeArtifactId=mvn-archetype-bukkit-base-plugin \
      -DarchetypeVersion=1.1.1 \
      -DgroupId="com.yourName" \
      -DartifactId="someplugin" \
      -Dversion="1.0.0" \
      -Dname="SomePlugin" \
      -Dauthor="YourName" \
      -Ddescription="It's an awesome plugin!"

The above command already has the fields set up so the plugin package would be `com.yourName.someplugin`, the display name would be `SomePlugin`, the version would be `1.0.0`, and the description is `It's an awesome plugin!`.

_**Note: There will be a better command-line tool for creating projects as soon as I can figure out how to make it work on Windows as well as Unix-based systems.**_
